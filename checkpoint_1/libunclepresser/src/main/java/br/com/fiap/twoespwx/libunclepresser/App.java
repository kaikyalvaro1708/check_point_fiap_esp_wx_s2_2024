/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * GRUPO: DO CHAPÉU DE PALHA
 * Autores:
 *      - Juan Pinheiro     -   rm552202
 *      - Luigi Ferrara     -   rm98047
 *      - Pedro Henrique    -   rm99534 ( Foi para o next )
 *      - Lucas Rodrigues   -   rm98344 ( Foi para o next )
 *      - Kaiky Alvaro      -   rm98118 ( Foi para o next )
 */
package br.com.fiap.twoespwx.libunclepresser;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("LIB UNCLE PRESSER - GRUPO BATATA-DOCE");
    }

    static void writeFile(String path, String content) throws IOException {
        Files.write(Paths.get(path), content.getBytes());
    }
}