package cn.song.entity;

public class ProblemType {
	private int ptId;// 问题类型表id
	private String ptType;// 问题类型名称

	public ProblemType() {
		super();
	}

	public ProblemType(int ptId, String ptType) {
		super();
		this.ptId = ptId;
		this.ptType = ptType;
	}

	public int getPtId() {
		return ptId;
	}

	public void setPtId(int ptId) {
		this.ptId = ptId;
	}

	public String getPtType() {
		return ptType;
	}

	public void setPtType(String ptType) {
		this.ptType = ptType;
	}

	@Override
	public String toString() {
		return "ProblemType [ptId=" + ptId + ", ptType=" + ptType + "]";
	}

}
