package CC.Encycloped.Abs.Org.Comput.Bi;

import CC.$.Q2$1.Bool2$1;
import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;

import static CC.COd.Neds_Ovrid.No;

public class Rvrs_Both
{
	@Finishd(Is_Finishd=true)
	public static final Rvrsbl_CalculAtr Rapr=new Rvrsbl_CalculAtr(4)
	{
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public void Rvrs(Bool2$1 Fun,
			boolean A,boolean B,
			boolean[] Out)
		{
			boolean Rsult=Fun.Bool2$1(A,B);
			Out[0]=Rsult;
			Out[1]=!Rsult;
			Out[2]=A;
			Out[3]=B;
		}
	};
}