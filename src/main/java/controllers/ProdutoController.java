package controllers;
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<String> salvarProduto(@RequestBody Produto produto) {
        produtoService.salvarNoMongoDB(produto);

        produtoService.enviarParaFilaRabbitMQ(produto);

        return ResponseEntity.ok("Produto salvo e enviado para a fila com sucesso.");
    }
}
