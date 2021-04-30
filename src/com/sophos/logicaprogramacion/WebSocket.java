package com.sophos.logicaprogramacion;

import java.util.List;

public class WebSocket {

	// Estable la conexión

	public void enviarMesajes(List<Object> list, long time) {

		// sentencia envia tyco
		for (Object mensaje : list) {

			// Mesajes
			// log: momento exapto en el se envia el mensaje
			// mensaje:
			// Conexión esta viva: True or false
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
