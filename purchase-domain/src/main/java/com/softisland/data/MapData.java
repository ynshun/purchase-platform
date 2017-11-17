package com.softisland.data;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class MapData extends HashMap<Object, Object> implements Map<Object, Object> {
	private static final long serialVersionUID = -7151003119037998466L;

	public static MapData getInstance(Map<?, ?> data) {
		MapData mapData = getInstance();
		for (Object key : data.keySet()) {
			mapData.put(key, data.get(key));
		}
		return mapData;
	}
	
	public static MapData getInstance() {
		return new MapData();
	}

	public MapData put(Object key, Object value) {
		super.put(key, value);
		return this;
	}

	public <T> T get(Object key, Class<T> type) {
		return this.get(key, type, null);
	}

	public <T> T get(Object key, Class<T> type, boolean force) {
		return force ? (T) this.get(key) : this.get(key, type, null);
	}

	public <T> T get(Object key, Class<T> type, T defaultData) {
		Object data = this.get(key);
		if (data == null) {
			return defaultData == null ? null : defaultData;
		}
		return TypeUtil.transfer(data, type);
	}
	
}
