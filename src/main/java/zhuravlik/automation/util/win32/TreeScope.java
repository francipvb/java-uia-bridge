/*
   Copyright (C) 2012 Anton Lobov <zhuravlik> <ahmad200512[at]yandex.ru>

   This library is free software; you can redistribute it and/or
   modify it under the terms of the GNU Lesser General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   This library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
   Lesser General Public License for more details.

   You should have received a copy of the GNU Lesser General
   Public License along with this library; if not, write to the
   Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
   Boston, MA 02110-1301 USA
*/

package zhuravlik.automation.util.win32;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Администратор
 */
public enum TreeScope {
    Element(1),
    Children(2),
    Descendants(4),
    Parent(8),
    Ancestors(16),
    Subtree(7);
  
  private int value;
    
    private static final Map<Integer, TreeScope> lookup = new HashMap<Integer, TreeScope>();

  static{
    for (TreeScope suit : TreeScope.values()) {
      lookup.put(suit.getId(), suit);
    }
  }

  public static TreeScope fromId(int id) {
    return lookup.get(id);
  }
    
    
    public int getId() {
        return value;
    }

    private TreeScope(int value) {
        this.value = value;
    }
}
