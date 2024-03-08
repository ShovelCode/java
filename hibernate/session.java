Session sesssion = factory.openSession();
Transaction tx = null;

try {
    tx = session.beginTransaction();
    //other code
   tx.commit();
} catch (Exception e){
  if(tx!=null) tx.rollback();
  e.printStackTrace();
} finally {
  session.close();
}
