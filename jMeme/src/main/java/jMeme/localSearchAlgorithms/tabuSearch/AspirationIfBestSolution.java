/*
 * AspirationIfBestSolution.java 
 * 
 * This file is part of the jMeme library, the Evolutionary Computational tool 
   for designing Competent Memetic Algorithms (CMAs).
   
   Author:  Autilia Vitiello <avitiello@unisa.it>

   Copyright (c) 2016  Autilia Vitiello
	
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU Lesser General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU Lesser General Public License for more details.
 
   You should have received a copy of the GNU Lesser General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.
   
 */

package jMeme.localSearchAlgorithms.tabuSearch;



import jMeme.core.individuals.Individual;
import jMeme.localSearchAlgorithms.tabuSearch.movements.Movement;


public class AspirationIfBestSolution implements IAspirationCriteria {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2674122284257866640L;

	public boolean tabuAspiration(final Individual solution,
			final Movement proposedMvmnt, final Individual proposedSol,
			final TabuSearch tabuSearch) {
		
		
		return tabuSearch.isFirstBetterThanSecond( 
                proposedSol, 
                tabuSearch.getBestSolution(),
                tabuSearch.isMaximize() )
            ? true
            : false;
	}

}
