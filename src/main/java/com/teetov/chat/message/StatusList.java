package com.teetov.chat.message;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StatusList {
	
	public final static int NONE = 0;
	public final static int READY = 1;
	public final static int AFK = 2;
	public final static int READ_ONLY = 3;
	
	/**
	 * Код используется сервером, чтобы информировать других клиентов о том, что данный пользователь вышел из сети.
	 * @return значение статуса, информирующее о выходе клиента.
	 */
	public static int getExitStustus() {
		return EXIT;
	}
	
	private final static int EXIT = 4;
	
	private final static Map<Integer, String> statusMap = new HashMap<>();
	
	static {
		statusMap.put(NONE, "");
		statusMap.put(READY, "Готов поболтать");
		statusMap.put(AFK, "Отошёл на 5 минут");
		statusMap.put(READ_ONLY, "На самом деле я здесь");
	}
	
	/**
	 * Возвращает Map, в котором коды статусов (ключи) соотнесены с расшифровкий их значений.
	 * @return unmodifiableMap со списком статусов и текстовым описанием
	 */
	public static Map<Integer, String> getAvailebelStatuses() {
		return Collections.unmodifiableMap(statusMap);
	}
	
	/**
	 * Возвращает текстовое описание для каждого статуса, кроме выходного.
	 * @param i код статуса
	 * @return связанное с ним текстовое описание
	 */
	public static String getStatus(int i) {
		return statusMap.get(i);
	}
}
