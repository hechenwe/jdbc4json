package com.sooncode.soonjdbc.entity;
import java.util.ArrayList;
import java.util.List;

import com.sooncode.soonjdbc.util.DbModel;
import com.sooncode.soonjdbc.util.DbField;


/**
* 学校
* SOONCODE_SCHOOL
* @author SOONJDBC CODE GENERATOR  
* 
*/ 
 
public class SooncodeSchoolDbModel extends DbModel {
	
	private static final String  TABLE_NAME = "SOONCODE_SCHOOL";

    /**学校名称*/
    public  DbField<String> schoolName = new DbField<String>(TABLE_NAME,"SCHOOL_NAME"){
    @Override
		public String getValue() {
			return  this.value;
		}

		@Override
		public void setValue(String value) {
			this.value = value;
		}
    };
    /**学习编号*/
    public  DbField<Integer> schoolId = new DbField<Integer>(TABLE_NAME,"SCHOOL_ID"){
    @Override
		public Integer getValue() {
			return  this.value;
		}

		@Override
		public void setValue(Integer value) {
			this.value = value;
		}
    };
    /**校长编号*/
    public  DbField<Integer> principalId = new DbField<Integer>(TABLE_NAME,"PRINCIPAL_ID"){
    @Override
		public Integer getValue() {
			return  this.value;
		}

		@Override
		public void setValue(Integer value) {
			this.value = value;
		}
    };
 
	public <T> SooncodeSchoolDbModel (T javaBean) {
		super.init(javaBean);
	}
	
	public SooncodeSchoolDbModel () {
		
	}

	@Override
	public String tableName() {
		return TABLE_NAME;
	}
 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DbField<?>> primaryKeys() {
		List<DbField<?>> primaryKeys = new ArrayList<>();
		primaryKeys.add(schoolId);
		return primaryKeys;
	}
	 
}
	 
