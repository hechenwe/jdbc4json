package com.sooncode.jdbc4json.page;

 

public class One2One<L, R> {

	private L left;
	private R right;

	public L getLeft() {
		return left;
	}

	public void setLeft(L left) {
		this.left = left;
	}

	public R getRight() {
		return right;
	}

	public void setRight(R right) {
		this.right = right;
	}

	public One2One() {

	}

	public One2One(L left, R right) {
		this.left = left;
		this.right = right;
	}

}
