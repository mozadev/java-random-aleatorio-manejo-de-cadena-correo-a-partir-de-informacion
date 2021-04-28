package com.mycompany.examen;

import java.util.Random;

public class NewClass {

    public static void main(String[] args) {

        long codigo;
        String nombre;
        String apeP;
        String apeM;
        String correoEle;

        codigo = LE.leerLong("ingresa el codigo");
        nombre = LE.leerString("ingresa el nombre");
        apeP = LE.leerString("Ingrese el apellido paterno");
        apeM = LE.leerString("Ingrese el apellido MATERNO");

        correoEle = generaCorreo(codigo, nombre, apeP, apeM);

        System.out.println("correo electronico: " + correoEle);
    }

    public static String generaCorreo(long codigo, String nombre, String apeP, String apeM) {
        String Correoelectronico; // crea la variable que une los partes del correo electronico

        char primera; // caracter
        char ultima; // ultima letra del apellido materno
        char aMinuscula; // primera letra del nombre en minuscula
        String apePminuscula; // variable apellidominuscula
        primera = nombre.charAt(0); // obtiene el primer caracter del nombre
        ultima = apeM.charAt(apeM.length() - 1);// ultima letra del apeM
        aMinuscula = Character.toLowerCase(primera);//primera letra del nombre
        apePminuscula = apeP.toLowerCase(); //convirtiendo a minuscula

        String codigocadena = String.valueOf(codigo); // convirtiendo el codigo a cadena
        String codigocadena2dig = codigocadena.substring(0, 2); // obteniendo los dos primeros digitos de la cadena codigo

        String[] dominios = {"@gmail.com", "@yahoo.com", "@hotmail.com"}; // crea una arreglo para recorrer aleatoriamente
        Random r = new Random(); // objeto de la clase random
        int valorDado = r.nextInt(2); // genera un numero aleatorio
        String Dominio = dominios[valorDado]; // escojo aleatoriamente un dominio de los 3 del arreglo
        Correoelectronico = aMinuscula + apePminuscula + ultima + codigocadena2dig + Dominio; // uniendo todas las subcadenas

        return Correoelectronico;
    }
}
