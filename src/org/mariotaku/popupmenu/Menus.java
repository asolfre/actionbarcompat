package org.mariotaku.popupmenu;

import java.util.ArrayList;
import java.util.Collection;

import android.view.MenuItem;

@SuppressWarnings("serial")
final class Menus extends ArrayList<MenuItem> {

	private final MenuAdapter mAdapter;

	public Menus() {
		this(null);
	}
	
	public Menus(MenuAdapter adapter) {
		mAdapter = adapter;
	}

	@Override
	public void add(int index, MenuItem object) {
		super.add(index, object);
		if (mAdapter != null) mAdapter.setMenuItems();
	}

	@Override
	public boolean add(MenuItem object) {
		boolean result = super.add(object);
		if (mAdapter != null) mAdapter.setMenuItems();
		return result;
	}

	@Override
	public boolean addAll(Collection<? extends MenuItem> collection) {
		boolean result = super.addAll(collection);
		if (mAdapter != null) mAdapter.setMenuItems();
		return result;
	}

	@Override
	public boolean addAll(int index, Collection<? extends MenuItem> collection) {
		boolean result = super.addAll(index, collection);
		if (mAdapter != null) mAdapter.setMenuItems();
		return result;
	}

	@Override
	public void clear() {
		if (mAdapter != null) mAdapter.setMenuItems();
		super.clear();
	}

	@Override
	public MenuItem remove(int index) {
		MenuItem result = super.remove(index);
		if (mAdapter != null) mAdapter.setMenuItems();
		return result;
	}

	@Override
	public boolean remove(Object object) {
		boolean result = super.remove(object);
		if (mAdapter != null) mAdapter.setMenuItems();
		return result;
	}

	@Override
	public MenuItem set(int index, MenuItem object) {
		MenuItem result = super.set(index, object);
		if (mAdapter != null) mAdapter.setMenuItems();
		return result;
	}

}