/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelManager;

import bedroom.Bedroom;
import binaryTree.Node;
import hashTable.HashTable;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import linkedList.LinkedList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import reservation.Reservation;
import user.User;

/**
 *
 * @author Gonzalo
 */
public class ExcelManager {

    /**
     * An array of Bedroom objects.
     */
    public Bedroom[] habs;
    /**
     * A LinkedList of reservations.
     */
    public LinkedList reservas;
    /**
     * A HashTable for storing room statuses.
     */
    public HashTable statusHabs;

    /**
     * Reads an Excel file from the specified path.
     *
     * @param path the path to the Excel file
     */
    public void read(String path) {
        // ---------------------------------------------------------------------
        XSSFWorkbook libro = null;
        // ---------------------------------------------------------------------
        try {
            //abrimos el XSSFWorkbook
            FileInputStream f = new FileInputStream(path);
            System.out.println("[I] INFO 0001: Este error es por un paquete que registra eventos en el Windows Events. Como no es necesario esa función no se le agrega y por consecuencia aparece este error");
            libro = new XSSFWorkbook(f);
            System.out.println("[I] INFO 0001: Enunciado finalizado");

        } catch (IOException e) {
            // Controlar error
        }
        // ---------------------------------------------------------------------
        int maximoIndice = libro.getNumberOfSheets();
        // ---------------------------------------------------------------------
        for (int i = 0; i < maximoIndice; i++) {
            XSSFSheet hoja = libro.getSheetAt(i);
            String nombreHoja = hoja.getSheetName().toLowerCase();
            switch (nombreHoja) {
                // -------------------------------------------------------------
                case "reservas":
                    System.out.println("[%] Loading bookings...");
                    this.reservas = this.getBookings(hoja);
                    this.reservas.sort();
                    break;
                // -------------------------------------------------------------
                case "habitaciones":
                    System.out.println("[%] Loading bedrooms...");
                    this.habs = this.getBedrooms(hoja);
                    break;
                // -------------------------------------------------------------
                case "historico":
                    System.out.println("[%] Loading history...");
                    if (habs == null) {
                        throw new Error("Error");
                    }
                    this.organizerHistory(hoja);
                    break;
                // -------------------------------------------------------------
                case "estado":
                    System.out.println("[%] Loading status...");
                    if (habs == null) {
                        throw new Error("Error");
                    }
                    this.statusHabs = this.getStatus(hoja);
                    break;
                // -------------------------------------------------------------
            }
        }
    }

    /**
     * Retrieves the bookings from the specified XSSFSheet.
     *
     * @param hoja the XSSFSheet containing the bookings data
     * @return a LinkedList of Reservation objects representing the bookings
     */
    private LinkedList getBookings(XSSFSheet hoja) {
        LinkedList ord = new LinkedList();
        int n = 0;

        // Índice de la primera fila
        int rowIndex = 0;

        // Obtiene la primera fila
        Row row = hoja.getRow(rowIndex);

        if (row != null) {
            // Índice de la primera celda
            int cellIndexStart = row.getFirstCellNum();

            // Índice de la última celda
            int cellIndexEnd = row.getLastCellNum();

            for (int cellIndex = cellIndexStart; cellIndex < 9; cellIndex++) {
                Cell cell = row.getCell(cellIndex);
                n++;
                String[] posicion = new String[2];
                if (cell != null) {
                    if ("ci".equals(cell.getStringCellValue())) {
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        posicion[0] = "ci";
                        ord.addLast(posicion);
                    } else if ("primer_nombre".equals(cell.getStringCellValue())) {
                        posicion[0] = "primer_nombre";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("segundo_nombre".equals(cell.getStringCellValue())) {
                        posicion[0] = "segundo_nombre";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("email".equals(cell.getStringCellValue())) {
                        posicion[0] = "email";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("genero".equals(cell.getStringCellValue())) {
                        posicion[0] = "genero";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("tipo_hab".equals(cell.getStringCellValue())) {
                        posicion[0] = "tipo_hab";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("celular".equals(cell.getStringCellValue())) {
                        posicion[0] = "celular";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("llegada".equals(cell.getStringCellValue())) {
                        posicion[0] = "llegada";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("salida".equals(cell.getStringCellValue())) {
                        posicion[0] = "salida";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else {
                    }
                }
            }
        }

        Cell columna;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //recorremos las filas
        LinkedList reservaciones = new LinkedList();

        // Índice de la segunda fila
        int rowIndexEnd = hoja.getLastRowNum();

        for (int p = 1; p <= rowIndexEnd; p++) {
            // Obtiene la fila por índice
            row = hoja.getRow(p);
            n = 0;

            // Índice de la primera celda
            if (row != null) {
                int cellIndexStart = row.getFirstCellNum();
                int cellIndexEnd = row.getLastCellNum();
                int dni = 0;
                String name = "";
                String last_name = "";
                String gener = "";
                String email = "";
                String phone = "";
                String ride = "";
                String departure = "";
                String type = "";
                for (int cellIndex = cellIndexStart; cellIndex < cellIndexEnd; cellIndex++) {
                    columna = row.getCell(cellIndex); // Obtiene la celda por índice
                    n++;
                    String[] orden = (String[]) ord.search2(n);
                    switch (orden[0]) {
                        case "ci":
                            double i = columna.getNumericCellValue();
                            String value = String.valueOf(i);
                            value = value.replace(".", "");
                            value = value.replace("E7", "");
                            dni = Integer.parseInt(value);
                            break;
                        case "primer_nombre":
                            name = columna.getStringCellValue();
                            break;
                        case "segundo_nombre":
                            last_name = columna.getStringCellValue();
                            break;
                        case "email":
                            email = columna.getStringCellValue();
                            break;
                        case "genero":
                            gener = columna.getStringCellValue();
                            break;
                        case "tipo_hab":
                            type = columna.getStringCellValue();
                            break;
                        case "celular":
                            phone = columna.getStringCellValue();
                            break;
                        case "llegada":
                            Date a = columna.getDateCellValue();
                            ride = sdf.format(a);
                            break;
                        case "salida":
                            Date b = columna.getDateCellValue();
                            departure = sdf.format(b);
                            break;
                    }
                    if (!"".equals(type) && !"".equals(ride) && !"".equals(departure) && !"".equals(last_name)
                            && !"".equals(name) && !"".equals(gener) && !"".equals(email) && !"".equals(phone) && dni != 0) {
                        User u = new User(dni, name, last_name, gener, email, phone);
                        u.setRide(ride);
                        u.setDeparture(departure);
                        Reservation r = new Reservation(u, type);
                        reservaciones.addLast(r);
                    }
                }
            }
        }
        return reservaciones;
    }

    /**
     * Retrieves the bedrooms from the specified XSSFSheet.
     *
     * @param hoja the XSSFSheet containing the bedrooms data
     * @return an array of Bedroom objects representing the bedrooms
     */
    private Bedroom[] getBedrooms(XSSFSheet hoja) {
        LinkedList ord = new LinkedList();
        int n = 0;

        // Índice de la primera fila
        int rowIndex = 0;

        // Obtiene la primera fila
        Row row = hoja.getRow(rowIndex);

        if (row != null) {
            // Índice de la primera celda
            int cellIndexStart = row.getFirstCellNum();

            // Índice de la última celda
            int cellIndexEnd = row.getLastCellNum();

            for (int cellIndex = cellIndexStart; cellIndex < 3; cellIndex++) {
                Cell cell = row.getCell(cellIndex);
                n++;
                String[] posicion = new String[2];
                if (cell != null) {
                    if ("num_hab".equals(cell.getStringCellValue())) {
                        posicion[0] = "num_hab";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("tipo_hab".equals(cell.getStringCellValue())) {
                        posicion[0] = "tipo_hab";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("piso".equals(cell.getStringCellValue())) {
                        posicion[0] = "piso";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else {
                        // Daniel dice: ?
                    }
                }
            }
        }

        // Cogemos todas las filas de esa hoja
        Row fila;
        Cell columna;
        LinkedList habitaciones = new LinkedList();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Recorremos las filas
        LinkedList reservaciones = new LinkedList();

        // Índice de la segunda fila
        int rowIndexEnd = hoja.getLastRowNum();

        for (int p = 1; p <= rowIndexEnd; p++) {
            // Obtiene la fila por índice
            row = hoja.getRow(p);
            n = 0;
            if (row != null) {
                // Índice de la primera celda
                int cellIndexStart = row.getFirstCellNum();
                int cellIndexEnd = row.getLastCellNum();
                String type = "";
                int piso = 0;
                String x = "";
                for (int cellIndex = cellIndexStart; cellIndex < cellIndexEnd; cellIndex++) {
                    // Obtiene la celda por índice
                    columna = row.getCell(cellIndex);

                    // Cogemos la siguiente fila. Cogemos todas las celdas de esa fila. Recorremos todas las celdas
                    n++;

                    //Cogemos la siguiente fila
                    String[] orden = (String[]) ord.search2(n);

                    switch (orden[0]) {
                        case "tipo_hab":
                            type = columna.getStringCellValue();
                            break;
                        case "piso":
                            double i = columna.getNumericCellValue();
                            piso = (int) i;
                            break;
                        default:
                            break;
                    }

                    if (!"".equals(type) && piso != 0) {
                        Bedroom b = new Bedroom(type, piso);
                        habitaciones.addLast(b);
                    }
                }
            }
        }

        Bedroom habsAux[] = new Bedroom[(int) habitaciones.size()];
        for (int i = 0; i < habitaciones.size(); i++) {

            habsAux[i] = (Bedroom) habitaciones.getValuePosition(i);
        }
        return habsAux;
    }

    /**
     * Retrieves the status of the bedrooms from the specified XSSFSheet and
     * returns a HashTable containing the occupancy status.
     *
     * @param hoja the XSSFSheet containing the bedrooms data
     * @return a HashTable representing the occupancy status of the bedrooms
     */
    private HashTable getStatus(XSSFSheet hoja) {
        LinkedList ord = new LinkedList();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = 0;

        // Índice de la primera fila
        int rowIndex = 0;

        // Obtiene la primera fila
        Row row = hoja.getRow(rowIndex);

        if (row != null) {
            // Índice de la primera celda
            int cellIndexStart = row.getFirstCellNum();

            // Índice de la última celda
            int cellIndexEnd = row.getLastCellNum();

            for (int cellIndex = cellIndexStart; cellIndex < 10; cellIndex++) {
                Cell cell = row.getCell(cellIndex);
                n++;
                String[] posicion = new String[2];

                if (cell != null) {
                    if ("num_hab".equals(cell.getStringCellValue())) {
                        posicion[0] = "num_hab";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("primer_nombre".equals(cell.getStringCellValue())) {
                        posicion[0] = "primer_nombre";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("apellido".equals(cell.getStringCellValue())) {
                        posicion[0] = "apellido";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("email".equals(cell.getStringCellValue())) {
                        posicion[0] = "email";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("genero".equals(cell.getStringCellValue())) {
                        posicion[0] = "genero";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("llegada".equals(cell.getStringCellValue())) {
                        posicion[0] = "llegada";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("celular".equals(cell.getStringCellValue())) {
                        posicion[0] = "celular";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else {
                        // Daniel dice otra vez: ?
                    }
                }
            }
        }

        HashTable b = new HashTable(habs.length);

        // Cogemos todas las filas de esa hoja
        int rowIndexEnd = hoja.getLastRowNum();
        Cell columna;

        for (int p = 1; p <= rowIndexEnd; p++) {
            // Obtiene la fila por índice
            row = hoja.getRow(p);
            n = 0;
            if (row != null) {
                // Índice de la primera celda
                int cellIndexStart = row.getFirstCellNum();
                int cellIndexEnd = row.getLastCellNum();
                String name = "";
                String last_name = "";
                String gener = "";
                String email = "";
                String phone = "";
                String ride = "";
                int num = 0;
                for (int cellIndex = cellIndexStart; cellIndex < cellIndexEnd; cellIndex++) {
                    // Obtiene la celda por índice
                    columna = row.getCell(cellIndex);

                    // Recorremos todas las celdas
                    n++;

                    // Cogemos la siguiente fila
                    // Segun el tipo de celda, usaremos uno u otra funcion
                    String[] orden = (String[]) ord.search2(n);
                    switch (orden[0]) {
                        case "num_hab":
                            num = (int) columna.getNumericCellValue();
                            break;
                        case "primer_nombre":
                            name = columna.getStringCellValue();
                            break;
                        case "apellido":
                            last_name = columna.getStringCellValue();
                            break;
                        case "email":
                            email = columna.getStringCellValue();
                            break;
                        case "genero":
                            gener = columna.getStringCellValue();
                            break;
                        case "celular":
                            phone = columna.getStringCellValue();
                            break;
                        case "llegada":
                            Date a = columna.getDateCellValue();
                            ride = sdf.format(a);
                            break;
                    }

                    if (!"".equals(last_name) && !"".equals(name) && !"".equals(gener) && !"".equals(email) && !"".equals(phone) && num != 0 && !"".equals(ride)) {
                        User u = new User(name, last_name, gener, email, phone);
                        u.setRide(ride);
                        u.setNum(num);
                        habs[num - 1].setOccupied(true);
                        b.insert(u);
                    }
                }
            }
        }
        return b;
    }

    /**
     * Organizes the reservation history from the specified XSSFSheet.
     *
     * @param hoja the XSSFSheet containing the reservation history data
     */
    private void organizerHistory(XSSFSheet hoja) {
        LinkedList ord = new LinkedList();
        int n = 0;

        // Índice de la primera fila
        int rowIndex = 0;

        // Obtiene la primera fila
        Row row = hoja.getRow(rowIndex);
        if (row != null) {
            // Índice de la primera celda
            int cellIndexStart = row.getFirstCellNum();

            // Índice de la última celda
            int cellIndexEnd = row.getLastCellNum();

            for (int cellIndex = cellIndexStart; cellIndex < 10; cellIndex++) {
                Cell cell = row.getCell(cellIndex);
                n++;
                String[] posicion = new String[2];

                if (cell != null) {
                    if ("ci".equals(cell.getStringCellValue())) {
                        posicion[0] = "ci";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("primer_nombre".equals(cell.getStringCellValue())) {
                        posicion[0] = "primer_nombre";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("apellido".equals(cell.getStringCellValue())) {
                        posicion[0] = "apellido";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("email".equals(cell.getStringCellValue())) {
                        posicion[0] = "email";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("genero".equals(cell.getStringCellValue())) {
                        posicion[0] = "genero";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("llegada".equals(cell.getStringCellValue())) {
                        posicion[0] = "llegada";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else if ("num_hab".equals(cell.getStringCellValue())) {
                        posicion[0] = "num_hab";
                        String p = String.valueOf(n);
                        posicion[1] = p;
                        ord.addLast(posicion);
                    } else {
                        // Daniel dice: Watafoc 3era vez
                    }
                }
            }
        }

        Iterator<Row> filas = hoja.iterator();
        Iterator<Cell> columnas;

        Row fila;
        Cell columna;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Recorremos las filas
        LinkedList reservaciones = new LinkedList();
        int rowIndexEnd = hoja.getLastRowNum();

        for (int p = 1; p <= rowIndexEnd; p++) {
            // Obtiene la fila por índice
            row = hoja.getRow(p);
            int dni = 0;
            String name = "";
            String last_name = "";
            String gener = "";
            String email = "";
            String ride = "";
            int num = 0;
            String phone = "";
            n = 0;
            if (row != null) {
                // Índice de la primera celda
                int cellIndexStart = row.getFirstCellNum();
                int cellIndexEnd = row.getLastCellNum();

                for (int cellIndex = cellIndexStart; cellIndex < cellIndexEnd; cellIndex++) {
                    // Obtiene la celda por índice
                    columna = row.getCell(cellIndex);

                    // Recorremos todas las celdas
                    n++;

                    // Cogemos la siguiente fila
                    String[] orden = (String[]) ord.search2(n);
                    switch (orden[0]) {
                        case "ci":
                            double i = columna.getNumericCellValue();
                            String value = String.valueOf(i);
                            value = value.replace(".", "");
                            value = value.replace("E7", "");
                            dni = Integer.parseInt(value);

                            break;
                        case "primer_nombre":
                            name = columna.getStringCellValue();
                            break;
                        case "apellido":
                            last_name = columna.getStringCellValue();
                            break;
                        case "email":
                            email = columna.getStringCellValue();
                            break;
                        case "genero":
                            gener = columna.getStringCellValue();
                            break;
                        case "llegada":
                            Date a = columna.getDateCellValue();
                            ride = sdf.format(a);
                            break;
                        case "num_hab":
                            num = (int) columna.getNumericCellValue();
                            break;
                    }

                    if (dni != 0 && !"".equals(last_name) && !"".equals(name) && !"".equals(gener) && !"".equals(email) && num != 0 && !"".equals(ride)) {
                        User u = new User(dni, name, last_name, gener, email, phone);
                        u.setRide(ride);
                        u.setNum(num);
                        Node aux = new Node(u);
                        habs[num - 1].getTree().insert(habs[num - 1].getTree().getpRoot(), aux);
                    }
                }
            }
        }
    }
}
