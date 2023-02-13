package com.xworkz.movies.Repository;

import com.xworkz.movies.dto.MoviesDTO;

public interface MoviesRepo {

	boolean save(MoviesDTO dto);
}
