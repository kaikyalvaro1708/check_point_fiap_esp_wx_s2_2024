# Relatório Técnico
### Grupo do Chapéu de Palha

## 1. Estrutura do Relatório

O projeto é uma implementação de compressão de dados utilizando o algoritmo Run-Length Encoding (RLE). A estrutura do projeto está organizada da seguinte forma:

### 1.1 Componentes Principais
- **App.java**: Classe principal que gerencia a interface de linha de comando e apresenta os resultados
- **RLECompressor.java**: Implementação do algoritmo de compressão RLE
- **AppTest.java**: Testes unitários para validação do algoritmo

### 1.2 Organização do Código
O código está estruturado seguindo boas práticas de programação Java:
- Pacote: `br.com.fiap.twoespwx.libunclepresser`
- Separação clara entre lógica e interface com usuário

## 2. Objetividade e Clareza

### 2.1 Propósito
O sistema tem como objetivo comprimir sequências de DNA (compostas por A, C, T, G) utilizando o algoritmo RLE, fornecendo informações detalhadas sobre o processo.

### 2.2 Funcionalidades Principais
1. Compressão de sequências usando RLE
2. Cálculo de frequências de nucleotídeos
3. Análise de taxa de compressão
4. Interface de linha de comando para processamento de arquivos
5. Geração de relatório detalhado da compressão

## 3. Domínio da Escrita do Código

### 3.1 Algoritmo RLE
```java
public static String compress(String input) {
    if (input == null || input.isEmpty()) return "";
    
    input = input.replaceAll("\\s+", "");
    StringBuilder compressed = new StringBuilder();
    int count = 1;
    char currentChar = input.charAt(0);

    for (int i = 1; i < input.length(); i++) {
        if (input.charAt(i) == currentChar) {
            count++;
        } else {
            compressed.append(currentChar).append(count);
            currentChar = input.charAt(i);
            count = 1;
        }
    }
    compressed.append(currentChar).append(count);
    
    return compressed.toString();
}
```

## 4. Apresentação dos Resultados

### 4.1 Interface do Usuário
O sistema apresenta uma interface em linha de comando clara e informativa:
```
 -----------------------------------------------------------
|           LIB UNCLE PRESSER - GRUPO DO CHAPÉU DE PALHA    |
|-----------------------------------------------------------|
|                                                           |
| INPUT  FILENAME: [nome do arquivo]                        |
| OUTPUT FILENAME: [nome do arquivo comprimido]             |
```

### 4.2 Métricas Apresentadas
- Tamanho do arquivo de entrada (KB)
- Número total de caracteres
- Frequência de cada nucleotídeo (A, C, T, G)
- Taxa de compressão
- Tamanho do arquivo de saída
- Score de eficiência da compressão

### 4.3 Sistema de Pontuação
O sistema classifica a eficiência da compressão da seguinte forma:
- EXCELLENT: < 50%
- WELL-DONE: 50-70%
- GOOD: 70-90%
- BAD: > 90%
