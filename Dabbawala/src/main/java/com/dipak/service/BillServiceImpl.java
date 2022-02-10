package com.dipak.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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
	public Bill removeBill(Bill bill) throws BillNotFoundException {
		if(billRepository.findById(bill.getBillId()).isEmpty())
		{
			throw new BillNotFoundException();
		}
		else
		{
			Bill deleteBill=billRepository.findById(bill.getBillId()).get();
			billRepository.deleteById(bill.getBillId());
			return deleteBill;
		}
		
	}
	
	//check
	@Override
	public Bill viewBill(int billId)throws BillNotFoundException {
		if(billRepository.findById(billId).isEmpty())
		{
			throw new BillNotFoundException();
		}
		
		return billRepository.findById(billId).get();
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		List<Bill> viewBill=billRepository.findAll();
		return viewBill.stream().filter(bill->bill.getStartDateTime().toString().equals(startDate.toString())
				&& bill.getEndDateTime().toString().equals(endDate.toString())).collect(Collectors.toList());
	}

	@Override
	public List<Bill> viewBills(int custId) throws BillNotFoundException {
		if(billRepository.findById(custId).isEmpty())
		{
			throw new BillNotFoundException();
		}
		else
		{
			List<Bill> viewListOfBills=(List<Bill>) billRepository.findById(custId).get();
			return viewListOfBills;
		}
		
	}

	@Override
	public double calculateTotalCost(Bill bill) {
		return bill.getTotalItem()*bill.getTotalCost();
	}

}
