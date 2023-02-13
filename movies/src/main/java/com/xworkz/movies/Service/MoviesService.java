package com.xworkz.movies.Service;

import com.xworkz.movies.dto.MoviesDTO;

public interface MoviesService {

	boolean validateAndSave(MoviesDTO dto);
}
