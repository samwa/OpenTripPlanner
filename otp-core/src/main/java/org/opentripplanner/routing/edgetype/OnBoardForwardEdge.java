/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (props, at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */


package org.opentripplanner.routing.edgetype;

/** 
 * Marker interface for edges which are on board a transit vehicle
 * when traversing forward.
 * 
 */
public interface OnBoardForwardEdge {

    /** 
     * The stop index (within the trip) of the stop this edge comes from. This is equivalent
     * to a hop index. 
     */
    int getStopIndex();

}
