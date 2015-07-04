/** 
 * Copyright 2011 Max Rohde
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package delight.functional.collections

import java.util.ArrayList
import java.util.Collection

/** 
 * An array list implementation depending on object identity (==) rather than
 * equality (.equals) to identify elements.<br/>
 * <br/>
 * See: <a href=
 * "http://nexnet.wordpress.com/2011/03/09/java-list-equality-and-object-identity/"
 * >KnowledgeNetworks: Java List Equality and Object Identity</a>
 * @author <a href="http://www.mxro.de/">Max Rohde</a>
 * @param<E>
 */
class IdentityArrayList<E> extends ArrayList<E> {
	static final long serialVersionUID = 1L

	override boolean remove(Object o) {
		val int indexOf = this.indexOf(o)
		if (indexOf === -1) {
			return false
		}
		return super.remove(indexOf) !== null
	}

	override boolean contains(Object o) {
		return indexOf(o) >= 0
	}

	override int indexOf(Object o) {

		for (var int i = 0; i < size(); i++) {
			if (o === get(i)) {
				return i
			}

		}
		return -1
	}

	override int lastIndexOf(Object o) {

		for (var int i = size() - 1; i >= 0; i--) {
			if (o === get(i)) {
				return i
			}

		}
		return -1
	}

	new() {
		super()
	}

	new(Collection<? extends E> c) {
		super(c)
	}

	new(int initialCapacity) {
		super(initialCapacity)
	}

}
