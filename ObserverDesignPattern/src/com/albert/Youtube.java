
package com.albert;

public class Youtube {

	public static void main(String[] args) {

		Channel MAC = new Channel();

		Subscriber s1 = new Subscriber("Mathias");
		Subscriber s2 = new Subscriber("Saskia");
		Subscriber s3 = new Subscriber("Jenny");

		MAC.subscribe(s1);
		MAC.subscribe(s2);
		MAC.subscribe(s3);

		MAC.unSubscribe(s3);

		s1.subscribeChannel(MAC);
		s2.subscribeChannel(MAC);
		s3.subscribeChannel(MAC);

		MAC.upload("how to learn ");

	}

}
