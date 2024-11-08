package br.com.alura.screanmatch.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio (@JsonAlias ("Title") String titulo,
                            @JsonAlias ("Episode") Integer numero,
                            @JsonAlias ("imdbRating") String avalia,
                            @JsonAlias ("Released") String dataLancamento
) {
}
