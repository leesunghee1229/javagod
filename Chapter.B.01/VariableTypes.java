public class VariableTypes {
	int instanceVariable;
	static int classVariable;

	public void method(int parameter) {
		int localVariable;
	}

	public void anotherMethod() {
		int localVariable;
	}

	public void anotherMethod2() {
		if (true) {
			int localVariable;
		}
		if (true) {
			int localVariable;
		}
	}

	public void anotherMethod3() {
		if (true) {
			int localVariable; // ¡¦ 1)
			if (true) {
				int localVariable; // ¡¦ 2) Compile Error
			}
		}
		if (true) {
			int localVariable;
		}
	}

}
