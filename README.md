# pizzaria

## Relacionamentos

1. **Cliente e Pedido**:
    - Um cliente pode ter vários pedidos.
    - Relacionamento: `1 Cliente -> N Pedidos`.

2. **Pedido e Pagamento**:
    - Cada pedido possui um único pagamento associado.
    - Relacionamento: `1 Pedido -> 1 Pagamento`.

---

## Diagrama UML

```plaintext
+-------------------+
|      Cliente      |
+-------------------+
| - id: Long        |
| - nome: String    |
| - email: String   |
+-------------------+

+-------------------+
|      Pedido       |
+-------------------+
| - id: Long        |
| - descricao: String|
| - clienteId: Long |
+-------------------+

+-------------------+
|     Pagamento     |
+-------------------+
| - id: Long        |
| - pedidoId: Long  |
| - formaPagamento: |
|   String          |
| - valorPago: double|
| - dataHoraPagamento|
|   : LocalDateTime |
+-------------------+

Cliente "1" <------ "N" Pedido
Pedido "1" <------ "1" Pagamento