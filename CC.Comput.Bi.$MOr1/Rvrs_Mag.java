package CC.Encycloped.Abs.Org.Comput.Bi;

import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;

import CC.$.Q2$1.Bool2$1;
import CC.$.Q2$2.Bool2$2;

import static CC.COd.Neds_Ovrid.No;

public class Rvrs_Mag
{
	public static final Bool2$2
		Or=(A,B,Out)->
		{
			Out[0]=A|B;
			Out[1]=A&B;
		},
		Al=(A,B,Out)->
		{
			Out[0]=A&B;
			Out[1]=A|B;
		},
		Xr=(A,B,Out)->
		{
			Out[0]=A^B;
			boolean Both=A&B;
			Out[1]=Both;
			Out[2]=Both;
		};

	@Finishd(Is_Finishd=true)
	public static final Rvrsbl_CalculAtr Rapr=new Rvrsbl_CalculAtr(3)
	{
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public void Rvrs(Bool2$1 Fun,
			boolean A,boolean B,
			boolean[] Out)
		{
			Out[0]=Fun.Bool2$1(A,B);
			Out[1]=A|B;
			Out[2]=A&B;
		}
	};
}