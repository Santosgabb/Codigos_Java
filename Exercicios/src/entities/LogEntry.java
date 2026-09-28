package entities;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class LogEntry {
	private String userName ;
	private Date moment;
	
	public LogEntry(String userName, Date moment) {
		this.userName = userName;
		this.moment = moment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	//criando o hashCose para saber quantos usuarios entrou

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(userName, other.userName);
	}
	
	
	
	
}
