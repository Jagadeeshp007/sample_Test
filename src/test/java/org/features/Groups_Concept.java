package org.features;

import org.testng.annotations.Test;

public class Groups_Concept {

	@Test(groups = "social")
	private void facebook() {
		System.out.println("Facebook");
	}

	@Test(groups = "social")
	private void whatsapp() {
		System.out.println("whatsapp");
	}

	@Test(groups = "social")
	private void instagram() {
		System.out.println("Instagram");
	}

	@Test(groups = "E-commerce")
	private void amazon() {
		System.out.println("Amazon");
	}

	@Test(groups = "music")
	private void spotify() {
		System.out.println("spotify");
	}

	@Test(groups = "music")
	private void ganna() {
		System.out.println("Ganna");
	}

	@Test(groups = "social")
	private void twitter() {
		System.out.println("Twitter");
	}

	@Test(groups = "E-commerce")
	private void flipcart() {
		System.out.println("Flipcart");
	}

	@Test(groups = "E-commerce")
	private void shoppingZone() {
		System.out.println("Shopping Zone");
	}
}
