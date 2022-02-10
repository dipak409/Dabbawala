package com.dipak.service;

import java.time.LocalDate;
import java.util.List;

import com.dipak.exception.BillNotFoundException;
import com.dipak.model.Bill;

public interface BillService {
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill) throws BillNotFoundException;
	public Bill removeBill(Bill bill) throws BillNotFoundException; 
	public Bill viewBill(int billId) throws BillNotFoundException;
	public List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
	public List<Bill> viewBills(int custId) throws BillNotFoundException;
	public double calculateTotalCost(Bill bill);
}
