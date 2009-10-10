/**
 * Copyright (C) 2003 - 2009
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.cilib.util.selection.weighing.entity;

import net.sourceforge.cilib.entity.Entity;
import net.sourceforge.cilib.entity.SocialEntity;
import net.sourceforge.cilib.problem.Fitness;

/**
 * Obtain the social best fitness value from a {@link SocialEntity}.
 * @param <E> The type that is both an {@code Entity} and a {@code SocialEntity}.
 *            An example of such an entity is the {@link net.sourceforge.cilib.entity.Particle}.
 * @author Wiehann Matthysen
 */
public class SocialBestFitness<E extends Entity & SocialEntity> implements EntityFitness<E> {

    /**
     * {@inheritDoc}
     * Obtains the social based fitness from the {@link SocialEntity}.
     */
    @Override
    public Fitness getFitness(E entity) {
        return entity.getSocialFitness();
    }

}
