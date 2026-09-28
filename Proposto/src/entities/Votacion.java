package entities;

import java.util.Objects;

public class Votacion {
	private String name;
	private Integer qtd ;
	
	public Votacion(String name, Integer qtd) {
		this.name = name;
		this.qtd = qtd;
	}
//get e set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
//hashcode e equals
	
	@Override
	public int hashCode() {
		return Objects.hash(name, qtd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votacion other = (Votacion) obj;
		return Objects.equals(name, other.name) && Objects.equals(qtd, other.qtd);
	}
}
