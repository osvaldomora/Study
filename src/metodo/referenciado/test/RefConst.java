package metodo.referenciado.test;

class Sample {
	private String s;

	Sample(String s) {
		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}
}

interface Interf2 {
	public Sample get(String s);
}

class RefConst {
	public static void main(String[] args) {
		Interf2 f = s -> new Sample(s);
		f.get("From Lambda Expression");
		Interf2 f1 = Sample::new;
		f1.get("From Constructor Reference");
	}
}
