/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.net.URI;

import java.net.http.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author LESLIE MORALES
 */
public class Http {

    /**
     * SE ENCARGA DE EXTRAER LA LISTA DE LOS REGISTROS DE LA BASE DE DATOS PARA
     * SER MOSTRADOS CUANDO SEA SOLICITADO
     *
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws TimeoutException
     */
    public List<Registro> listar() throws InterruptedException, ExecutionException, TimeoutException {
        String fecha;
        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost/CONTROL/crud/operation.php?accion=listar")).build();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        JSONArray albums = new JSONArray(response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS));
        List<Registro> l = new ArrayList<Registro>();
        for (int i = 0; i < albums.length(); i++) {
            JSONObject album = albums.getJSONObject(i);
            l.add(new Registro(album.getString("nombre"), album.getString("apellido"),
                    album.getString("Codigo"), album.getString("Carrera"),
                    album.getString("Sala"), album.getString("FechaE")));
            System.out.println(l.get(i).getFecha());
        }

        return l;
    }

    /**
     * SE ENCARGA DE ENVIAR LOS DATOS DEL REGISTRO A LA BASE DE DATOS A TRAVES DEL PROTOCOLO HTTP
     *
     * @param nombre
     * @param apellido
     * @param codigo
     * @param carrera
     * @param sala
     */
    public void enviar(String nombre, String apellido, String codigo, String carrera, String sala) {
        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost/CONTROL/crud/operation.php?accion=entrada&nombre=" + nombre + "&apellido=" + apellido + "&Codigo=" + codigo + "&Sala=" + sala + "&Carrera=" + carrera)).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body).join();

    }
}
