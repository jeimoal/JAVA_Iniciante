//Criacão de interface no SWING 

private void btnSituActionPer
 formed(java.awt.event.ActionEvent evt) {                                        
        int ano = Integer.parseInt(txtAno.getText());
        int idade = 2022 - ano;
        lblIdade.setText(Integer.toString(idade));
        String sit = (idade >= 18)?"Maior":"Menor";
        lblSit.setText(sit);
        String vot = ((idade>=16 && idade<18) || (idade > 70))?"Facultativo":"Obrigatório";
        lblVot.setText(vot);
    }        
