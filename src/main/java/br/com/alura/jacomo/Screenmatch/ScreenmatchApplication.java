package br.com.alura.jacomo.Screenmatch;

import br.com.alura.jacomo.Screenmatch.models.DadosSeries;
import br.com.alura.jacomo.Screenmatch.services.ConsumoAPI;
import br.com.alura.jacomo.Screenmatch.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?apikey=cb7aee58&t=mr+robot");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSeries dados = conversor.obterDados(json, DadosSeries.class);
		System.out.println(dados);

	}
}
