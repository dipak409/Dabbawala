package com.dipak.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dipak.model.Bill;

@Service
public class BillServiceImpl implements BillService{

	@Override
	public Bill addBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill updateBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill removeBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill viewBill(int billId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> viewBills(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateTotalCost(Bill bill) {
		// TODO Auto-generated method stub
		return 0;
	}

}
