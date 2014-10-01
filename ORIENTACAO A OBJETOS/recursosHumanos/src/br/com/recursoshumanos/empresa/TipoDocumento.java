package br.com.recursoshumanos.empresa;

public enum TipoDocumento {
	RG {
		@Override
		public boolean validar(String documento) {
			System.out.println("Validando o RG");
			return false;
		}
	}, CPF {
		@Override
		public boolean validar(String documento) {
			System.out.println("Validando CPF");
			return false;
		}
	};
	
	public abstract boolean validar(String documento);
	

}
