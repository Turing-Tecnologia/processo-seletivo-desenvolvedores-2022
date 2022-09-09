package Ufersa.example.Test.API.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ufersa.example.Test.API.Repositorys.CarrosRepository;
import Ufersa.example.Test.API.models.Carro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/carro")
@Api(value="API REST Carros")
@CrossOrigin(origins="*")
public class APIController {
	
	@Autowired
	private CarrosRepository cr;
	
	@ApiOperation(value="Salva um carro no banco de dados")
	@PostMapping
    public Carro post(@RequestBody  Carro carro){
        return cr.save(carro);
    }
	
    @ApiOperation(value="Retorna uma lista com todos os carros")
    @GetMapping
    public List<Carro> listagem(){
        return cr.findAll();
    }
    
    @ApiOperation(value="Retorna um carro conforme o id especificado")
    @GetMapping("/{id}")
    public Optional<Carro> buscarCarro(@PathVariable Long id){
        return cr.findById(id);
    }

    @ApiOperation(value="Deleta um Carro pelo id")
    @DeleteMapping("/{id}")
    public String remove(@PathVariable Long id){
        cr.deleteById(id);
        return "Carro excluído com sucesso!!";
    }
    @ApiOperation(value="Atualiza um carro")
	@PutMapping
	public Carro atualizaCarro (@RequestBody Carro carro ) {   
		return  cr.save(carro);
	}
}
