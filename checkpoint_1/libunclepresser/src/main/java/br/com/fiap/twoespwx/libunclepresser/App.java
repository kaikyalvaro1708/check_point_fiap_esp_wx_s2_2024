/* 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Grupo: Batata Doce
 * Autores: 
 *      - João da Silva     -   jaodasilva@example.com
 *      - Jose da Silva     -   zedasilva@example.com
 *      - Maria da Silva    -   marydasilva@example.com
 *      - Monica da Silva   -   nicadasilva@example.com
 */
package br.com.fiap.twoespwx.libunclepresser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class App {
    public static void main(String[] args) {
        System.out.println("LIB UNCLE PRESSER - Bando do chapéu de palha");

        if (args.length != 2) {
            System.out.println("Uso: java App entrada.txt saida.txt");
            return;
        }

        String inputPath = args[0];
        String outputPath = args[1];

        try {
            String input = readFile(inputPath);
            String compressed = compress(input);
            writeFile(outputPath, compressed);
            System.out.println("Compressão concluída!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static String compress(String input) {
        if (input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        result.append(currentChar).append(count);
        return result.toString();
    }

    static String readFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return new String(bytes).replaceAll("\\s+", "");
    }

    static void writeFile(String path, String content) throws IOException {
        Files.write(Paths.get(path), content.getBytes());
    }
}