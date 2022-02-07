//Criando botão de SOMA no SWING

private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {        
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int s = n1 + n2;
        lblSoma.setText(Integer.toString(s));
    }
