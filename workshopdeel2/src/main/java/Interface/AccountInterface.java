package Interface;

import java.util.List;

import POJO.Account;

public interface AccountInterface {
	
	public void save(Account account);
	public void update(Account account);
	public List<Account> findAll();
	public Account findByID(long id);
	public void delete(Account account);

}
