
package in.co.rays.project_3.model;

import java.util.List;

import in.co.rays.project_3.dto.CartOverviewDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;

public interface CartOverviewModelInt {
		public long add(CartOverviewDTO dto)throws ApplicationException,DuplicateRecordException;
		public void delete(CartOverviewDTO dto)throws ApplicationException;
		public void update(CartOverviewDTO dto)throws ApplicationException,DuplicateRecordException;
		public CartOverviewDTO findByPK(long pk)throws ApplicationException;
		public CartOverviewDTO findByLogin(String login)throws ApplicationException;
		public List list()throws ApplicationException;
		public List list(int pageNo,int pageSize)throws ApplicationException;
		public List search(CartOverviewDTO dto,int pageNo,int pageSize)throws ApplicationException;
		public List search(CartOverviewDTO dto)throws ApplicationException;
		public List getRoles(CartOverviewDTO dto)throws ApplicationException;
		
	}
