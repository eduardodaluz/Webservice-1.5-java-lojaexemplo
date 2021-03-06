package br.com.cbmp.ecommerce.contexto;

//https://qasecommerce.cielo.com.br/servicos/ecommwsec.do
//https://ecommerce.cielo.com.br/servicos/ecommwsec.do
public enum DestinoUrl {

	ECOM("https://qasecommerce.cielo.com.br/servicos/ecommwsec.do"),
	
	// Download Retorno Lote
	DOWNLOAD_RET_LOTE("https://ecommerce.cielo.com.br/lote/ecommwsecLoteDownload.do"),
	
	//Upload de Lote
	UPLOAD_LOTE("https://ecommerce.cielo.com.br/lote/ecommwsecLoteUpload.do");

	
	
	private String url;
	
	private DestinoUrl(String url) {
		this.url = url;
	}

	 public String getUrl() {  
         return this.url;  
     }  
}
