# 🧭 Padrões Strategy e Observer em Java

![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Patterns](https://img.shields.io/badge/Padrões-Strategy%20%2B%20Observer-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)

> Prática 5 da disciplina de **Princípios e Padrões de Projeto** (BCC FACOM/UFU): quatro exercícios que aplicam os padrões comportamentais **Strategy** e **Observer** do catálogo GoF.

---

## 📋 Visão Geral

| Questão | Padrão | Contexto |
|---------|--------|----------|
| `questao1` | Strategy | Carrinho de compras com formas de pagamento intercambiáveis (Pix, cartão e boleto) |
| `questao2` | Strategy | Carrinho que combina estratégias de pagamento e de frete (Normal e Sedex) |
| `questao3` | Observer | Estação meteorológica (CET) que notifica a Prefeitura e o Aeroporto de Uberlândia |
| `questao4` | Observer | Ações da bolsa que notificam investidores, que compram ou vendem por meio de corretoras |

---

## 🔍 Detalhamento

### Questão 1 — Strategy: formas de pagamento

`CarrinhoCompras` calcula o total dos itens e delega o pagamento a uma `PagamentoStrategy`. As implementações `PixPagamento`, `CartaoPagamento` e `BoletoPagamento` podem ser trocadas em tempo de execução sem alterar o carrinho.

### Questão 2 — Strategy: pagamento + frete

Estende a questão 1 com uma segunda família de estratégias, `FreteStrategy`, calculada a partir do peso total e do valor da compra:

- `NormalFrete`: taxa base de R$ 10,00 + R$ 4,00/kg, com frete grátis para compras a partir de R$ 500,00.
- `SedexFrete`: taxa base de R$ 20,00 + R$ 8,00/kg.

### Questão 3 — Observer: alertas meteorológicos

`CET` é o sujeito observado: a cada coleta de temperatura, umidade e rajada de vento, notifica todos os `ObservadorTempo` registrados.

- `PrefeituraUberlandia` emite avisos de atenção ou alertas da Defesa Civil quando a umidade do ar fica baixa.
- `AeroportoUberlandia` reage a rajadas de vento fortes.

### Questão 4 — Observer: monitoramento de ações

Cada `Acao` notifica os investidores interessados quando seu preço muda. Cada `Investidor` define um `LimitePreco` (mínimo e máximo) por ação:

- preço **≥ máximo** → a corretora (`AcaoBroker`) executa uma **venda**;
- preço **≤ mínimo** → a corretora executa uma **compra**.

---

## 🗂️ Estrutura do Projeto

```
src/main/java/
├── questao1/   # Strategy — pagamentos
├── questao2/   # Strategy — pagamentos + frete
├── questao3/   # Observer — estação meteorológica
└── questao4/   # Observer — bolsa de valores
```

---

## ⚙️ Como Compilar e Executar

**Pré-requisito:** JDK 8 ou superior.

```bash
cd src/main/java
javac -d ../../../out questao1/*.java questao2/*.java questao3/*.java questao4/*.java
cd ../../..

java -cp out questao1.Main
java -cp out questao2.Main
java -cp out questao3.Main
java -cp out questao4.Main
```

---

## 👤 Autor

**Cauê Fernando Faria Abreu**, Ciência da Computação, UFU

[![GitHub](https://img.shields.io/badge/GitHub-CaueFAbreu-181717?style=flat&logo=github)](https://github.com/CaueFAbreu)
