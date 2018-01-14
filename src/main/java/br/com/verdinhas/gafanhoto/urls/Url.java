package br.com.verdinhas.gafanhoto.urls;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Url {

	@Id
	public String id;

	private String url;

	private Date date;

	public Url(String url, Date date) {
		this.url = url;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Url other = (Url) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

}
