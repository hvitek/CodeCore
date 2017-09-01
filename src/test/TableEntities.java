package test;

import java.io.Serializable;
import javax.persistence.*;

import model.Wf;

import java.util.List;

public abstract class TableEntities implements Serializable {
	
	public abstract Wf getWfBean();
	
}
