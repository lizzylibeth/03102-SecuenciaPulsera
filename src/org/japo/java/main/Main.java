/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {

        //Constantes
        final String NOMBRE_NIÑA = "Marta";
        final double DINERO_INICIAL = 1.00;
        final String ARTICULO_COMPRAR = "Pulsera hippy";
        final double PRECIO_ARTICULO = 0.70;

        //Variables
        double dineroRestante = DINERO_INICIAL - PRECIO_ARTICULO;

        //Cabecera
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");

        System.out.printf("Nombre de la niña ...: %s%n", NOMBRE_NIÑA);
        System.out.printf(Locale.ENGLISH, "Dinero inicial ......: %.2f €%n",
                DINERO_INICIAL);

        //Separador
        System.out.println("---");

        System.out.printf("Artículo a comprar ..: %s%n", ARTICULO_COMPRAR);
        System.out.printf(Locale.ENGLISH, "Precio artículo .....: %.2f €%n",
                PRECIO_ARTICULO);

        //Separador
        System.out.println("---");

        System.out.printf(Locale.ENGLISH, "Dinero restante .....: %.2f €%n",
                dineroRestante);

    }//main

}//class
