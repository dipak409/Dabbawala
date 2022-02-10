package com.dipak.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipak.exception.BillNotFoundException;
import com.dipak.model.Bill;
import com.dipak.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService{
	
	private BillRepository billRepository;
	
	@Autowired
	public BillServiceImpl(BillRepository billRepository) {
		this.billRepository = billRepository;
	}

	@Override
	public Bill addBill(Bill bill) {
		
		return billRepository.save(bill);
	}

	@Override
	public Bill updateBill(Bill bill) throws BillNotFoundException {
		if(billRepository.findById(bill.getBillId()).isEmpty())
		{
			throw new BillNotFoundException();
		}
		return billRepository.save(bill);
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
