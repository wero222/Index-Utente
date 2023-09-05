package it.corso.model;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

public class Utente
{
	@Pattern(regexp = "[a-zA-Z\\s']{1,50}", message = "Campo nome errato")
	private String nome;
	
	@Min(value = 1, message = "Valore troppo basso")
	@Max(value = 120, message = "Valore troppo alto")
	private int eta;
	
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,20}", message = "Password troppo debole")
	private String password;
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getEta()
	{
		return eta;
	}
	public void setEta(int eta)
	{
		this.eta = eta;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
}