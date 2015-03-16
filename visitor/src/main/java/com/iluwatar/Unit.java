package com.iluwatar;

/**
 * 
 * Interface for the nodes in hierarchy.
 * 
 */

// this is just a comment to test review
    //one more comment




public abstract class Unit {

	private Unit[] children;

	public Unit(Unit... children) {
		this.children = children;
	}

	public void accept(UnitVisitor visitor) {
		for (Unit child : children) {
			child.accept(visitor);
		}
	}
}
