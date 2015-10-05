/*
 *     Copyright (C) 2015  higherfrequencytrading.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.openhft.chronicle.values;

import net.openhft.chronicle.values.constraints.MaxSize;

/**
 * User: peter.lawrey Date: 08/10/13 Time: 09:09
 */
public interface GetUsingStringInterface {

    void setSomeStringField(@MaxSize(64) String s);

    void setAnotherStringField(@MaxSize(64) String s);

    String getSomeStringField();

    void getUsingSomeStringField(StringBuilder builder);

    StringBuilder getUsingAnotherStringField(StringBuilder builder);
}

