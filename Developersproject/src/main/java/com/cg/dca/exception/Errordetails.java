package com.cg.dca.exception;
import java.time.LocalDateTime;

public class Errordetails {
	 private LocalDateTime ldt;
	  private String message;
	  private String details;
	    
	    public Errordetails(LocalDateTime ldt, String message, String details) {
	        super();
	        this.ldt = ldt;
	        this.message = message;
	        this.details = details;
	    }

	   

	    public LocalDateTime getLdt() {
			return ldt;
		}



		public void setLdt(LocalDateTime ldt) {
			this.ldt = ldt;
		}



		public String getMessage() {
	         return message;
	    }

	    public String getDetails() {
	         return details;
	    }

}
