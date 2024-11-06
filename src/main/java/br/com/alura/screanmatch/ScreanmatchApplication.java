package br.com.alura.screanmatch;

import br.com.alura.screanmatch.model.DadosSerie;
import br.com.alura.screanmatch.service.ConsumoAPI;
import br.com.alura.screanmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreanmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreanmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=afd5316d");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();

		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
