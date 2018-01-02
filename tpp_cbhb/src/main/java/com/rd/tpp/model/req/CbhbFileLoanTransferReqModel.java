package com.rd.tpp.model.req;

import java.io.Serializable;
import java.util.List;

/**
 * TODO 存量标迁移请求参数
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年8月1日 下午2:06:08
 */
public class CbhbFileLoanTransferReqModel implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 9147885885065904358L;

	/**
	 * 标的ID
	 */
	private String borrowId;
	
	/**
	 * 标的属性（1-对私，2-对公）
	 */
	private String borrowTyp;
	
	/**
	 * 标的金额（放款金额=明细投资金额总和）
	 */
	private String borrowerAmt;
	
	/**
	 * 标利息（标的预期收益金额或预期收益率（百分比形式不带百分号，如5%送5））
	 */
	private String borrowerInterestAmt;
	
	/**
	 * 借款人存管客户号（根据borrowTyp取不同值）
	 * 1-存管平台客户号  2-对公账号（非渤海行对公账号需提前开设充值户）
	 */
	private String borrCustId;
	
	/**
	 * 对公账户户名（根据borrowTyp取不同值）
	 * 1-为空  2-对公户名（校验账户与户名是否相同）
	 */
	private String accountName;
	
	/**
	 * 担保人账号（担保还款时，费用由担保账户扣除，担保账户需在渤海银行开设）
	 */
	private String guaranteeNo;
	
	/**
	 * 募集开始日
	 */
	private String borrowerStartDate;
	
	/**
	 * 募集到期日
	 */
	private String borrowerEndDate;
	
	/**
	 * 标到期日
	 */
	private String borrowerRepayDate;
	
	/**
	 * 放款方式，默认0
	 */
	private String releaseType;
	
	/**
	 * 投资期限类型（可空）
	 * 1-日 2-月 3-年
	 */
	private String investDateType;
	
	/**
	 * 投资期限（可空）
	 */
	private String investPeriod;
	
	/**
	 * 标的详细信息（可空）
	 */
	private String borrowerDetails;
	
	/**
	 * 总笔数
	 */
	private String totalNum;
	
	/**
	 * 商户保留域（可空）
	 */
	private String merPriv1;
	
	/**
	 * 商户保留域（可空）
	 */
	private String merPriv2;
	
	List<CbhbFileLoanTransferReqDetailModel> transferDetailList; //投标明细

	/**
	 * 获取borrowId
	 * @return borrowId
	 */
	public String getBorrowId() {
		return borrowId;
	}

	/**
	 * 设置borrowId
	 * @param borrowId 要设置的borrowId
	 */
	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	/**
	 * 获取borrowTyp
	 * @return borrowTyp
	 */
	public String getBorrowTyp() {
		return borrowTyp;
	}

	/**
	 * 设置borrowTyp
	 * @param borrowTyp 要设置的borrowTyp
	 */
	public void setBorrowTyp(String borrowTyp) {
		this.borrowTyp = borrowTyp;
	}

	/**
	 * 获取borrowerAmt
	 * @return borrowerAmt
	 */
	public String getBorrowerAmt() {
		return borrowerAmt;
	}

	/**
	 * 设置borrowerAmt
	 * @param borrowerAmt 要设置的borrowerAmt
	 */
	public void setBorrowerAmt(String borrowerAmt) {
		this.borrowerAmt = borrowerAmt;
	}

	/**
	 * 获取borrowerInterestAmt
	 * @return borrowerInterestAmt
	 */
	public String getBorrowerInterestAmt() {
		return borrowerInterestAmt;
	}

	/**
	 * 设置borrowerInterestAmt
	 * @param borrowerInterestAmt 要设置的borrowerInterestAmt
	 */
	public void setBorrowerInterestAmt(String borrowerInterestAmt) {
		this.borrowerInterestAmt = borrowerInterestAmt;
	}

	/**
	 * 获取borrCustId
	 * @return borrCustId
	 */
	public String getBorrCustId() {
		return borrCustId;
	}

	/**
	 * 设置borrCustId
	 * @param borrCustId 要设置的borrCustId
	 */
	public void setBorrCustId(String borrCustId) {
		this.borrCustId = borrCustId;
	}

	/**
	 * 获取accountName
	 * @return accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * 设置accountName
	 * @param accountName 要设置的accountName
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * 获取guaranteeNo
	 * @return guaranteeNo
	 */
	public String getGuaranteeNo() {
		return guaranteeNo;
	}

	/**
	 * 设置guaranteeNo
	 * @param guaranteeNo 要设置的guaranteeNo
	 */
	public void setGuaranteeNo(String guaranteeNo) {
		this.guaranteeNo = guaranteeNo;
	}

	/**
	 * 获取borrowerStartDate
	 * @return borrowerStartDate
	 */
	public String getBorrowerStartDate() {
		return borrowerStartDate;
	}

	/**
	 * 设置borrowerStartDate
	 * @param borrowerStartDate 要设置的borrowerStartDate
	 */
	public void setBorrowerStartDate(String borrowerStartDate) {
		this.borrowerStartDate = borrowerStartDate;
	}

	/**
	 * 获取borrowerEndDate
	 * @return borrowerEndDate
	 */
	public String getBorrowerEndDate() {
		return borrowerEndDate;
	}

	/**
	 * 设置borrowerEndDate
	 * @param borrowerEndDate 要设置的borrowerEndDate
	 */
	public void setBorrowerEndDate(String borrowerEndDate) {
		this.borrowerEndDate = borrowerEndDate;
	}

	/**
	 * 获取borrowerRepayDate
	 * @return borrowerRepayDate
	 */
	public String getBorrowerRepayDate() {
		return borrowerRepayDate;
	}

	/**
	 * 设置borrowerRepayDate
	 * @param borrowerRepayDate 要设置的borrowerRepayDate
	 */
	public void setBorrowerRepayDate(String borrowerRepayDate) {
		this.borrowerRepayDate = borrowerRepayDate;
	}

	/**
	 * 获取releaseType
	 * @return releaseType
	 */
	public String getReleaseType() {
		return releaseType;
	}

	/**
	 * 设置releaseType
	 * @param releaseType 要设置的releaseType
	 */
	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

	/**
	 * 获取investDateType
	 * @return investDateType
	 */
	public String getInvestDateType() {
		return investDateType;
	}

	/**
	 * 设置investDateType
	 * @param investDateType 要设置的investDateType
	 */
	public void setInvestDateType(String investDateType) {
		this.investDateType = investDateType;
	}

	/**
	 * 获取investPeriod
	 * @return investPeriod
	 */
	public String getInvestPeriod() {
		return investPeriod;
	}

	/**
	 * 设置investPeriod
	 * @param investPeriod 要设置的investPeriod
	 */
	public void setInvestPeriod(String investPeriod) {
		this.investPeriod = investPeriod;
	}

	/**
	 * 获取borrowerDetails
	 * @return borrowerDetails
	 */
	public String getBorrowerDetails() {
		return borrowerDetails;
	}

	/**
	 * 设置borrowerDetails
	 * @param borrowerDetails 要设置的borrowerDetails
	 */
	public void setBorrowerDetails(String borrowerDetails) {
		this.borrowerDetails = borrowerDetails;
	}

	/**
	 * 获取totalNum
	 * @return totalNum
	 */
	public String getTotalNum() {
		return totalNum;
	}

	/**
	 * 设置totalNum
	 * @param totalNum 要设置的totalNum
	 */
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	/**
	 * 获取merPriv1
	 * @return merPriv1
	 */
	public String getMerPriv1() {
		return merPriv1;
	}

	/**
	 * 设置merPriv1
	 * @param merPriv1 要设置的merPriv1
	 */
	public void setMerPriv1(String merPriv1) {
		this.merPriv1 = merPriv1;
	}

	/**
	 * 获取merPriv2
	 * @return merPriv2
	 */
	public String getMerPriv2() {
		return merPriv2;
	}

	/**
	 * 设置merPriv2
	 * @param merPriv2 要设置的merPriv2
	 */
	public void setMerPriv2(String merPriv2) {
		this.merPriv2 = merPriv2;
	}

	/**
	 * 获取transferDetailList
	 * @return transferDetailList
	 */
	public List<CbhbFileLoanTransferReqDetailModel> getTransferDetailList() {
		return transferDetailList;
	}

	/**
	 * 设置transferDetailList
	 * @param transferDetailList 要设置的transferDetailList
	 */
	public void setTransferDetailList(
			List<CbhbFileLoanTransferReqDetailModel> transferDetailList) {
		this.transferDetailList = transferDetailList;
	}

}
